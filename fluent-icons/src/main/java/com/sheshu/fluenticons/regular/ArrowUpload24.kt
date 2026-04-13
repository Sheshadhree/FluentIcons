package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowUpload24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowUpload24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.25f, 3.51f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            lineToRelative(-13f, -0.004f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.335f, -0.75f, 0.75f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            lineToRelative(13f, 0.004f)
            close()
            moveToRelative(-6.602f, 18.488f)
            lineToRelative(0.102f, 0.007f)
            curveToRelative(0.38f, 0f, 0.694f, -0.282f, 0.743f, -0.649f)
            lineToRelative(0.007f, -0.101f)
            lineTo(12.499f, 7.57f)
            lineToRelative(3.722f, 3.72f)
            curveToRelative(0.266f, 0.266f, 0.683f, 0.29f, 0.976f, 0.073f)
            lineToRelative(0.085f, -0.073f)
            curveToRelative(0.266f, -0.266f, 0.29f, -0.683f, 0.072f, -0.977f)
            lineToRelative(-0.073f, -0.084f)
            lineToRelative(-4.997f, -4.996f)
            curveToRelative(-0.266f, -0.266f, -0.683f, -0.29f, -0.976f, -0.073f)
            lineToRelative(-0.085f, 0.072f)
            lineTo(6.22f, 10.23f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.768f, 0f, 1.06f)
            curveToRelative(0.265f, 0.267f, 0.682f, 0.292f, 0.976f, 0.074f)
            lineTo(7.28f, 11.29f)
            lineToRelative(3.719f, -3.713f)
            lineTo(11f, 21.255f)
            curveToRelative(0f, 0.38f, 0.282f, 0.693f, 0.648f, 0.743f)
            close()
        }
    }.build()
}
