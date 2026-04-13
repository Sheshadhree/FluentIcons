package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VideoOff20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoOff20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.853f, 2.147f)
            curveToRelative(-0.195f, -0.196f, -0.511f, -0.196f, -0.707f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            lineToRelative(1.48f, 1.479f)
            curveTo(2.66f, 4.83f, 2f, 5.838f, 2f, 7f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(5f)
            curveToRelative(1.438f, 0f, 2.639f, -1.011f, 2.932f, -2.361f)
            lineToRelative(4.214f, 4.215f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-15f, -15f)
            close()
            moveTo(14f, 11.878f)
            lineToRelative(3.076f, 3.075f)
            curveToRelative(0.509f, -0.14f, 0.922f, -0.598f, 0.922f, -1.207f)
            verticalLineTo(6.252f)
            curveToRelative(0f, -1.007f, -1.132f, -1.601f, -1.96f, -1.029f)
            lineTo(14f, 6.63f)
            verticalLineToRelative(5.249f)
            close()
            moveTo(6.121f, 4f)
            lineTo(13f, 10.879f)
            verticalLineTo(7f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(6.121f)
            close()
        }
    }.build()
}
