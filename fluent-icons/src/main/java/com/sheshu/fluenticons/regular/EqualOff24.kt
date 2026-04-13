package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.EqualOff24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.EqualOff24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.28f, 2.22f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineTo(6.94f, 8f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 8f, 3f, 8.336f, 3f, 8.75f)
            reflectiveCurveTo(3.336f, 9.5f, 3.75f, 9.5f)
            horizontalLineToRelative(4.69f)
            lineToRelative(5f, 5f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 14.5f, 3f, 14.836f, 3f, 15.25f)
            reflectiveCurveTo(3.336f, 16f, 3.75f, 16f)
            horizontalLineToRelative(11.19f)
            lineToRelative(5.78f, 5.78f)
            curveToRelative(0.292f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.292f, 0.293f, -0.767f, 0f, -1.06f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(20.25f, 14.5f)
            horizontalLineToRelative(-2.568f)
            lineToRelative(1.5f, 1.5f)
            horizontalLineToRelative(1.068f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            close()
            moveTo(11.182f, 8f)
            lineToRelative(1.5f, 1.5f)
            horizontalLineToRelative(7.568f)
            curveTo(20.664f, 9.5f, 21f, 9.164f, 21f, 8.75f)
            reflectiveCurveTo(20.664f, 8f, 20.25f, 8f)
            horizontalLineToRelative(-9.068f)
            close()
        }
    }.build()
}
