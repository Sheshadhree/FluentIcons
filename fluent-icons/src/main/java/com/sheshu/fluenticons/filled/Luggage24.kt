package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Luggage24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Luggage24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.75f, 2f)
            curveTo(8.336f, 2f, 8f, 2.336f, 8f, 2.75f)
            reflectiveCurveTo(8.336f, 3.5f, 8.75f, 3.5f)
            horizontalLineTo(9f)
            verticalLineTo(5f)
            horizontalLineTo(8.25f)
            curveTo(6.455f, 5f, 5f, 6.455f, 5f, 8.25f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.352f, 0.825f, 2.511f, 2f, 3f)
            verticalLineToRelative(1f)
            curveTo(7f, 21.664f, 7.336f, 22f, 7.75f, 22f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(20.5f)
            horizontalLineToRelative(7f)
            verticalLineToRelative(0.75f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(17f, 21.664f, 17f, 21.25f)
            verticalLineToRelative(-1f)
            curveToRelative(1.174f, -0.489f, 2f, -1.648f, 2f, -3f)
            verticalLineToRelative(-9f)
            curveTo(19f, 6.455f, 17.545f, 5f, 15.75f, 5f)
            horizontalLineTo(15f)
            verticalLineTo(3.5f)
            horizontalLineToRelative(0.25f)
            curveTo(15.664f, 3.5f, 16f, 3.164f, 16f, 2.75f)
            reflectiveCurveTo(15.664f, 2f, 15.25f, 2f)
            horizontalLineToRelative(-6.5f)
            close()
            moveToRelative(4.75f, 1.5f)
            verticalLineTo(5f)
            horizontalLineToRelative(-3f)
            verticalLineTo(3.5f)
            horizontalLineToRelative(3f)
            close()
            moveTo(8f, 9.75f)
            curveTo(8f, 9.336f, 8.336f, 9f, 8.75f, 9f)
            horizontalLineToRelative(6.5f)
            curveTo(15.664f, 9f, 16f, 9.336f, 16f, 9.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-6.5f)
            curveTo(8.336f, 10.5f, 8f, 10.164f, 8f, 9.75f)
            close()
        }
    }.build()
}
