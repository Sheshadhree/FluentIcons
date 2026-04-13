package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AddSubtractCircle28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AddSubtractCircle28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.95f, 17.3f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveToRelative(0.336f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineToRelative(-4.5f)
            close()
            moveTo(14f, 26f)
            curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
            reflectiveCurveTo(20.627f, 2f, 14f, 2f)
            reflectiveCurveTo(2f, 7.373f, 2f, 14f)
            reflectiveCurveToRelative(5.373f, 12f, 12f, 12f)
            close()
            moveToRelative(0f, -1.5f)
            curveToRelative(-2.63f, 0f, -5.034f, -0.967f, -6.876f, -2.564f)
            lineTo(21.936f, 7.124f)
            curveTo(23.533f, 8.967f, 24.5f, 11.37f, 24.5f, 14f)
            curveToRelative(0f, 5.799f, -4.701f, 10.5f, -10.5f, 10.5f)
            close()
            moveTo(7f, 10.25f)
            curveTo(7f, 9.836f, 7.336f, 9.5f, 7.75f, 9.5f)
            horizontalLineToRelative(1.744f)
            lineTo(9.49f, 7.702f)
            curveToRelative(0f, -0.415f, 0.335f, -0.751f, 0.749f, -0.752f)
            curveToRelative(0.414f, 0f, 0.75f, 0.334f, 0.751f, 0.748f)
            lineTo(10.994f, 9.5f)
            horizontalLineToRelative(1.756f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(13.164f, 11f, 12.75f, 11f)
            horizontalLineToRelative(-1.753f)
            lineTo(11f, 12.748f)
            curveToRelative(0.001f, 0.415f, -0.334f, 0.751f, -0.748f, 0.752f)
            curveToRelative(-0.415f, 0f, -0.75f, -0.334f, -0.752f, -0.748f)
            lineTo(9.497f, 11f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 11f, 7f, 10.664f, 7f, 10.25f)
            close()
        }
    }.build()
}
