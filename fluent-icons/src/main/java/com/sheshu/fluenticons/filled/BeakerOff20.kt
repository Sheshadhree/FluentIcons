package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BeakerOff20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BeakerOff20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.853f, 2.147f)
            curveToRelative(-0.195f, -0.196f, -0.511f, -0.196f, -0.707f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            lineToRelative(4.848f, 4.848f)
            verticalLineToRelative(0.985f)
            curveToRelative(0f, 0.579f, -0.143f, 1.15f, -0.418f, 1.66f)
            lineTo(5.685f, 12f)
            horizontalLineToRelative(5.608f)
            lineToRelative(1f, 1f)
            horizontalLineTo(5.146f)
            lineToRelative(-0.964f, 1.79f)
            curveToRelative(-0.539f, 1f, 0.184f, 2.212f, 1.32f, 2.212f)
            horizontalLineToRelative(8.997f)
            curveToRelative(0.506f, 0f, 0.93f, -0.242f, 1.198f, -0.598f)
            lineToRelative(1.45f, 1.45f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-15f, -15f)
            close()
            moveToRelative(4.141f, 2.726f)
            lineTo(14.121f, 12f)
            horizontalLineToRelative(0.194f)
            lineToRelative(-0.892f, -1.656f)
            curveToRelative(-0.275f, -0.51f, -0.419f, -1.08f, -0.419f, -1.66f)
            verticalLineTo(4f)
            horizontalLineTo(14f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(14.276f, 3f, 14f, 3f)
            horizontalLineTo(6f)
            curveTo(5.761f, 3f, 5.562f, 3.167f, 5.512f, 3.39f)
            lineTo(6.122f, 4f)
            horizontalLineToRelative(0.872f)
            verticalLineToRelative(0.873f)
            close()
        }
    }.build()
}
