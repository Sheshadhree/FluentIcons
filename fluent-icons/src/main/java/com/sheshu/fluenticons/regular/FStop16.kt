package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.FStop16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FStop16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.844f, 3.845f)
            curveToRelative(0.21f, -1.271f, 1.475f, -2.08f, 2.717f, -1.736f)
            lineToRelative(0.805f, 0.224f)
            curveToRelative(0.266f, 0.073f, 0.542f, -0.083f, 0.616f, -0.349f)
            curveToRelative(0.073f, -0.266f, -0.083f, -0.541f, -0.349f, -0.615f)
            lineToRelative(-0.805f, -0.223f)
            curveToRelative(-1.814f, -0.504f, -3.664f, 0.678f, -3.97f, 2.537f)
            lineTo(7.31f, 7f)
            horizontalLineTo(4.5f)
            curveTo(4.224f, 7f, 4f, 7.224f, 4f, 7.5f)
            curveTo(4f, 7.777f, 4.224f, 8f, 4.5f, 8f)
            horizontalLineToRelative(2.646f)
            lineToRelative(-0.524f, 3.183f)
            curveToRelative(-0.244f, 1.479f, -1.879f, 2.27f, -3.19f, 1.543f)
            lineToRelative(-0.69f, -0.383f)
            curveToRelative(-0.241f, -0.134f, -0.546f, -0.047f, -0.68f, 0.194f)
            curveToRelative(-0.133f, 0.242f, -0.046f, 0.546f, 0.195f, 0.68f)
            lineToRelative(0.69f, 0.383f)
            curveToRelative(1.916f, 1.063f, 4.306f, -0.093f, 4.662f, -2.254f)
            lineTo(8.159f, 8f)
            horizontalLineTo(10.5f)
            curveTo(10.776f, 8f, 11f, 7.777f, 11f, 7.5f)
            curveTo(11f, 7.224f, 10.776f, 7f, 10.5f, 7f)
            horizontalLineTo(8.324f)
            lineToRelative(0.52f, -3.156f)
            close()
        }
    }.build()
}
