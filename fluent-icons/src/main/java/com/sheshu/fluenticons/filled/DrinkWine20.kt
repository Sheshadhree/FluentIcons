package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DrinkWine20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DrinkWine20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 2f)
            curveTo(5.224f, 2f, 5f, 2.224f, 5f, 2.5f)
            verticalLineTo(8f)
            curveToRelative(0f, 2.593f, 1.974f, 4.725f, 4.5f, 4.975f)
            verticalLineTo(17f)
            horizontalLineToRelative(-2f)
            curveTo(7.224f, 17f, 7f, 17.224f, 7f, 17.5f)
            reflectiveCurveTo(7.224f, 18f, 7.5f, 18f)
            horizontalLineToRelative(5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(12.776f, 17f, 12.5f, 17f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-4.025f)
            curveTo(13.025f, 12.725f, 15f, 10.593f, 15f, 8f)
            verticalLineTo(2.5f)
            curveTo(15f, 2.224f, 14.776f, 2f, 14.5f, 2f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(6f, 5.5f)
            verticalLineTo(3f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(2.5f)
            horizontalLineTo(6f)
            close()
            moveToRelative(7.452f, 2.575f)
            curveToRelative(-0.12f, 0.718f, -0.46f, 1.381f, -0.974f, 1.896f)
            curveToRelative(-0.514f, 0.516f, -1.175f, 0.858f, -1.893f, 0.98f)
            curveToRelative(-0.272f, 0.046f, -0.53f, -0.137f, -0.577f, -0.41f)
            curveToRelative(-0.046f, -0.272f, 0.138f, -0.53f, 0.41f, -0.576f)
            curveToRelative(0.512f, -0.087f, 0.985f, -0.332f, 1.352f, -0.7f)
            curveToRelative(0.367f, -0.368f, 0.61f, -0.841f, 0.696f, -1.354f)
            curveToRelative(0.045f, -0.272f, 0.303f, -0.456f, 0.575f, -0.411f)
            curveToRelative(0.273f, 0.045f, 0.457f, 0.303f, 0.411f, 0.575f)
            close()
        }
    }.build()
}
