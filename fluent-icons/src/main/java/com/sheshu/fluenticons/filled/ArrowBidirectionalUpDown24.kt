package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowBidirectionalUpDown24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowBidirectionalUpDown24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.975f, 9.689f)
            curveToRelative(-0.38f, 0.4f, -1.013f, 0.416f, -1.414f, 0.036f)
            curveToRelative(-0.4f, -0.38f, -0.416f, -1.013f, -0.036f, -1.414f)
            lineToRelative(4.75f, -5f)
            curveTo(11.464f, 3.112f, 11.725f, 3f, 12f, 3f)
            curveToRelative(0.274f, 0f, 0.536f, 0.112f, 0.725f, 0.311f)
            lineToRelative(4.75f, 5f)
            curveToRelative(0.38f, 0.4f, 0.364f, 1.034f, -0.036f, 1.414f)
            curveToRelative(-0.4f, 0.38f, -1.034f, 0.364f, -1.414f, -0.036f)
            lineTo(13f, 6.505f)
            verticalLineToRelative(10.99f)
            lineToRelative(3.025f, -3.184f)
            curveToRelative(0.38f, -0.4f, 1.013f, -0.416f, 1.414f, -0.036f)
            curveToRelative(0.4f, 0.38f, 0.416f, 1.013f, 0.036f, 1.414f)
            lineToRelative(-4.75f, 5f)
            curveTo(12.536f, 20.887f, 12.275f, 21f, 12f, 21f)
            curveToRelative(-0.274f, 0f, -0.536f, -0.113f, -0.725f, -0.311f)
            lineToRelative(-4.75f, -5f)
            curveToRelative(-0.38f, -0.4f, -0.364f, -1.034f, 0.036f, -1.414f)
            curveToRelative(0.4f, -0.38f, 1.034f, -0.364f, 1.414f, 0.036f)
            lineTo(11f, 17.495f)
            verticalLineTo(6.505f)
            lineTo(7.975f, 9.689f)
            close()
        }
    }.build()
}
