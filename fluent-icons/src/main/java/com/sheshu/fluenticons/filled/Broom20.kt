package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Broom20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Broom20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.91f, 2.182f)
            curveToRelative(0.195f, 0.195f, 0.195f, 0.511f, 0f, 0.707f)
            lineTo(13.298f, 7.5f)
            curveToRelative(-0.106f, -0.127f, -0.219f, -0.25f, -0.338f, -0.37f)
            curveToRelative(-0.119f, -0.119f, -0.242f, -0.231f, -0.37f, -0.337f)
            lineToRelative(4.613f, -4.612f)
            curveToRelative(0.195f, -0.196f, 0.512f, -0.196f, 0.707f, 0f)
            close()
            moveToRelative(-5.657f, 5.657f)
            curveToRelative(-1.757f, -1.758f, -4.607f, -1.758f, -6.364f, 0f)
            lineTo(5.468f, 8.26f)
            lineToRelative(6.364f, 6.364f)
            lineToRelative(0.421f, -0.422f)
            curveToRelative(1.757f, -1.757f, 1.757f, -4.606f, 0f, -6.364f)
            close()
            moveToRelative(-10.51f, 2.753f)
            lineTo(4.644f, 8.85f)
            lineToRelative(0.002f, 0.002f)
            lineToRelative(6.5f, 6.5f)
            curveToRelative(0.032f, 0.032f, 0.067f, 0.058f, 0.103f, 0.08f)
            lineTo(9.5f, 18.348f)
            curveToRelative(-0.078f, 0.132f, -0.214f, 0.22f, -0.367f, 0.239f)
            curveToRelative(-0.153f, 0.019f, -0.306f, -0.034f, -0.415f, -0.143f)
            lineToRelative(-7.07f, -7.071f)
            curveToRelative(-0.11f, -0.109f, -0.162f, -0.262f, -0.143f, -0.415f)
            curveToRelative(0.019f, -0.152f, 0.107f, -0.288f, 0.239f, -0.367f)
            close()
        }
    }.build()
}
