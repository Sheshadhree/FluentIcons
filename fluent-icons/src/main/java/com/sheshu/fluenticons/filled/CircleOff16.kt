package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CircleOff16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CircleOff16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.874f, 12.582f)
            lineToRelative(2.272f, 2.272f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-13f, -13f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(2.272f, 2.272f)
            curveTo(2.534f, 5.17f, 2f, 6.523f, 2f, 8f)
            curveToRelative(0f, 3.314f, 2.686f, 6f, 6f, 6f)
            curveToRelative(1.477f, 0f, 2.83f, -0.534f, 3.874f, -1.418f)
            close()
            moveTo(14f, 8f)
            curveToRelative(0f, 1.113f, -0.303f, 2.155f, -0.83f, 3.048f)
            lineTo(4.951f, 2.83f)
            curveTo(5.845f, 2.303f, 6.887f, 2f, 8f, 2f)
            curveToRelative(3.314f, 0f, 6f, 2.686f, 6f, 6f)
            close()
        }
    }.build()
}
