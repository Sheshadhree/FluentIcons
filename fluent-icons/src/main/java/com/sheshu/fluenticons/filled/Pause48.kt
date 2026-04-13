package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Pause48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pause48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.75f, 6f)
            curveTo(9.679f, 6f, 8f, 7.679f, 8f, 9.75f)
            verticalLineToRelative(28.5f)
            curveTo(8f, 40.321f, 9.679f, 42f, 11.75f, 42f)
            horizontalLineToRelative(6.5f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineTo(9.75f)
            curveTo(22f, 7.679f, 20.321f, 6f, 18.25f, 6f)
            horizontalLineToRelative(-6.5f)
            close()
            moveToRelative(18f, 0f)
            curveTo(27.679f, 6f, 26f, 7.679f, 26f, 9.75f)
            verticalLineToRelative(28.5f)
            curveToRelative(0f, 2.071f, 1.679f, 3.75f, 3.75f, 3.75f)
            horizontalLineToRelative(6.5f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineTo(9.75f)
            curveTo(40f, 7.679f, 38.321f, 6f, 36.25f, 6f)
            horizontalLineToRelative(-6.5f)
            close()
        }
    }.build()
}
