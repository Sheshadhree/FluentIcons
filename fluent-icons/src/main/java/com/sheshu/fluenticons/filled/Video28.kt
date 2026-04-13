package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Video28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Video28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 9.75f)
            curveTo(2f, 7.679f, 3.679f, 6f, 5.75f, 6f)
            horizontalLineToRelative(8.5f)
            curveTo(16.321f, 6f, 18f, 7.679f, 18f, 9.75f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineToRelative(-8.5f)
            curveTo(3.679f, 22f, 2f, 20.321f, 2f, 18.25f)
            verticalLineToRelative(-8.5f)
            close()
            moveToRelative(21.252f, 10.933f)
            lineTo(19f, 17.747f)
            verticalLineTo(10.25f)
            lineToRelative(4.252f, -2.936f)
            curveToRelative(1.16f, -0.802f, 2.744f, 0.03f, 2.744f, 1.44f)
            verticalLineToRelative(10.49f)
            curveToRelative(0f, 1.41f, -1.583f, 2.241f, -2.744f, 1.44f)
            close()
        }
    }.build()
}
