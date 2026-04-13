package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Target32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Target32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 13.75f)
            curveToRelative(-1.243f, 0f, -2.25f, 1.007f, -2.25f, 2.25f)
            reflectiveCurveToRelative(1.007f, 2.25f, 2.25f, 2.25f)
            reflectiveCurveToRelative(2.25f, -1.007f, 2.25f, -2.25f)
            reflectiveCurveToRelative(-1.007f, -2.25f, -2.25f, -2.25f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 8.75f)
            curveToRelative(-4.004f, 0f, -7.25f, 3.246f, -7.25f, 7.25f)
            reflectiveCurveToRelative(3.246f, 7.25f, 7.25f, 7.25f)
            reflectiveCurveToRelative(7.25f, -3.246f, 7.25f, -7.25f)
            reflectiveCurveTo(20.004f, 8.75f, 16f, 8.75f)
            close()
            moveTo(11.25f, 16f)
            curveToRelative(0f, -2.623f, 2.127f, -4.75f, 4.75f, -4.75f)
            reflectiveCurveToRelative(4.75f, 2.127f, 4.75f, 4.75f)
            reflectiveCurveToRelative(-2.127f, 4.75f, -4.75f, 4.75f)
            reflectiveCurveToRelative(-4.75f, -2.127f, -4.75f, -4.75f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.001f, 3.75f)
            curveTo(9.235f, 3.75f, 3.75f, 9.235f, 3.75f, 16.001f)
            curveToRelative(0f, 6.766f, 5.485f, 12.252f, 12.251f, 12.252f)
            curveToRelative(6.766f, 0f, 12.252f, -5.486f, 12.252f, -12.252f)
            curveTo(28.253f, 9.235f, 22.767f, 3.75f, 16f, 3.75f)
            close()
            moveTo(6.25f, 16.001f)
            curveToRelative(0f, -5.385f, 4.366f, -9.751f, 9.751f, -9.751f)
            curveToRelative(5.386f, 0f, 9.752f, 4.366f, 9.752f, 9.751f)
            curveToRelative(0f, 5.386f, -4.366f, 9.752f, -9.752f, 9.752f)
            curveToRelative(-5.385f, 0f, -9.751f, -4.366f, -9.751f, -9.752f)
            close()
        }
    }.build()
}
