package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowDownload24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowDownload24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.25f, 20.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.337f, 0.75f, 0.75f)
            curveToRelative(0f, 0.415f, -0.336f, 0.75f, -0.75f, 0.75f)
            lineToRelative(-13f, 0.005f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            lineToRelative(13f, -0.004f)
            close()
            moveTo(11.648f, 2.014f)
            lineToRelative(0.102f, -0.007f)
            curveToRelative(0.38f, 0f, 0.694f, 0.282f, 0.743f, 0.648f)
            lineTo(12.5f, 2.756f)
            lineTo(12.499f, 16.44f)
            lineToRelative(3.722f, -3.72f)
            curveToRelative(0.266f, -0.267f, 0.683f, -0.29f, 0.976f, -0.073f)
            lineToRelative(0.085f, 0.073f)
            curveToRelative(0.266f, 0.266f, 0.29f, 0.683f, 0.072f, 0.976f)
            lineToRelative(-0.073f, 0.084f)
            lineToRelative(-4.997f, 4.997f)
            curveToRelative(-0.266f, 0.266f, -0.683f, 0.29f, -0.976f, 0.073f)
            lineToRelative(-0.085f, -0.073f)
            lineToRelative(-5.003f, -4.996f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.768f, 0f, -1.061f)
            curveToRelative(0.265f, -0.267f, 0.682f, -0.291f, 0.976f, -0.073f)
            lineTo(7.28f, 12.72f)
            lineToRelative(3.719f, 3.714f)
            lineTo(11f, 2.756f)
            curveToRelative(0f, -0.38f, 0.282f, -0.694f, 0.648f, -0.743f)
            lineToRelative(0.102f, -0.007f)
            lineToRelative(-0.102f, 0.007f)
            close()
        }
    }.build()
}
