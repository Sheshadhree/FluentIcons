package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VideoOff16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoOff16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.992f, 10.7f)
            lineToRelative(4.154f, 4.154f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-13f, -13f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(1.355f, 1.354f)
            curveTo(1.617f, 3.593f, 1f, 4.475f, 1f, 5.5f)
            verticalLineToRelative(5f)
            curveTo(1f, 11.88f, 2.12f, 13f, 3.5f, 13f)
            horizontalLineToRelative(4f)
            curveToRelative(1.314f, 0f, 2.39f, -1.013f, 2.492f, -2.3f)
            close()
            moveToRelative(0.928f, -1.902f)
            lineToRelative(3.157f, 3.158f)
            curveToRelative(0.508f, -0.142f, 0.919f, -0.6f, 0.919f, -1.206f)
            verticalLineTo(5.252f)
            curveToRelative(0f, -1.007f, -1.131f, -1.601f, -1.96f, -1.029f)
            lineTo(10.9f, 5.698f)
            curveToRelative(0.013f, 0.092f, 0.02f, 0.187f, 0.02f, 0.282f)
            verticalLineToRelative(2.818f)
            close()
            moveTo(5.12f, 3f)
            lineTo(10f, 7.879f)
            verticalLineTo(5.5f)
            curveTo(10f, 4.12f, 8.88f, 3f, 7.5f, 3f)
            horizontalLineTo(5.121f)
            close()
        }
    }.build()
}
