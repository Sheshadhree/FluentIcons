package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HeartOff16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HeartOff16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.452f, 11.16f)
            lineToRelative(3.694f, 3.694f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-13f, -13f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(1.946f, 1.945f)
            curveToRelative(-0.05f, 0.044f, -0.099f, 0.09f, -0.146f, 0.137f)
            curveTo(1.68f, 5.202f, 1.686f, 7.259f, 2.958f, 8.53f)
            lineToRelative(4.707f, 4.708f)
            curveToRelative(0.195f, 0.195f, 0.512f, 0.195f, 0.707f, 0f)
            lineToRelative(2.08f, -2.08f)
            close()
            moveToRelative(2.603f, -2.602f)
            lineToRelative(-1.188f, 1.188f)
            lineToRelative(-6.754f, -6.754f)
            curveTo(5.987f, 2.96f, 6.873f, 3.28f, 7.542f, 3.948f)
            lineTo(7.995f, 4.4f)
            lineToRelative(0.447f, -0.448f)
            curveToRelative(1.268f, -1.269f, 3.327f, -1.262f, 4.6f, 0.012f)
            curveToRelative(1.272f, 1.271f, 1.276f, 3.323f, 0.013f, 4.593f)
            close()
        }
    }.build()
}
