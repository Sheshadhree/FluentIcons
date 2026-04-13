package com.sheshu.fluenticons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Light.Attach32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.Attach32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.077f, 4.217f)
            lineToRelative(-14.93f, 14.93f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.708f)
            curveToRelative(0.195f, 0.195f, 0.511f, 0.195f, 0.707f, 0f)
            lineToRelative(14.93f, -14.93f)
            curveToRelative(2.566f, -2.567f, 6.726f, -2.567f, 9.292f, 0f)
            curveToRelative(2.567f, 2.566f, 2.567f, 6.726f, 0f, 9.292f)
            lineTo(13.287f, 28.006f)
            curveToRelative(-1.323f, 1.323f, -3.47f, 1.323f, -4.793f, 0f)
            curveToRelative(-1.323f, -1.324f, -1.323f, -3.47f, 0f, -4.793f)
            lineToRelative(11.86f, -11.86f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.511f, 0f, -0.707f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            lineTo(7.787f, 22.506f)
            curveToRelative(-1.714f, 1.714f, -1.714f, 4.493f, 0f, 6.207f)
            curveToRelative(1.714f, 1.714f, 4.493f, 1.714f, 6.207f, 0f)
            lineToRelative(13.79f, -13.789f)
            curveToRelative(2.956f, -2.956f, 2.956f, -7.75f, 0f, -10.707f)
            curveToRelative(-2.957f, -2.956f, -7.75f, -2.956f, -10.707f, 0f)
            close()
        }
    }.build()
}
