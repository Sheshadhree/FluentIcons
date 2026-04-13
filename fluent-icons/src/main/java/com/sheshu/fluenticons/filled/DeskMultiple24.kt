package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DeskMultiple24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DeskMultiple24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.75f, 3.5f)
            curveTo(5.772f, 3.5f, 4.939f, 4.126f, 4.63f, 5f)
            horizontalLineToRelative(12.62f)
            curveToRelative(1.795f, 0f, 3.25f, 1.455f, 3.25f, 3.25f)
            verticalLineToRelative(8.537f)
            curveToRelative(0.02f, 0.397f, 0.348f, 0.713f, 0.75f, 0.713f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-8.5f)
            curveToRelative(0f, -2.623f, -2.127f, -4.75f, -4.75f, -4.75f)
            horizontalLineTo(6.75f)
            close()
            moveTo(2f, 8.25f)
            curveTo(2f, 7.007f, 3.007f, 6f, 4.25f, 6f)
            horizontalLineToRelative(13f)
            curveToRelative(1.243f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(18f, 19.664f, 18f, 19.25f)
            verticalLineTo(9.5f)
            horizontalLineTo(2f)
            verticalLineTo(8.25f)
            close()
            moveTo(2f, 11f)
            horizontalLineToRelative(9f)
            verticalLineToRelative(6.75f)
            curveTo(11f, 18.993f, 9.993f, 20f, 8.75f, 20f)
            horizontalLineToRelative(-4.5f)
            curveTo(3.007f, 20f, 2f, 18.993f, 2f, 17.75f)
            verticalLineTo(11f)
            close()
            moveToRelative(3.25f, 2f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(8.164f, 13f, 7.75f, 13f)
            horizontalLineToRelative(-2.5f)
            close()
        }
    }.build()
}
