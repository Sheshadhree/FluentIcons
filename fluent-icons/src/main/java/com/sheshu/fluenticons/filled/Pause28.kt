package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Pause28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pause28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.75f, 3f)
            curveTo(5.231f, 3f, 4f, 4.231f, 4f, 5.75f)
            verticalLineToRelative(16.5f)
            curveTo(4f, 23.769f, 5.231f, 25f, 6.75f, 25f)
            horizontalLineToRelative(3f)
            curveToRelative(1.519f, 0f, 2.75f, -1.231f, 2.75f, -2.75f)
            verticalLineTo(5.75f)
            curveTo(12.5f, 4.231f, 11.269f, 3f, 9.75f, 3f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(11.5f, 0f)
            curveToRelative(-1.519f, 0f, -2.75f, 1.231f, -2.75f, 2.75f)
            verticalLineToRelative(16.5f)
            curveToRelative(0f, 1.519f, 1.231f, 2.75f, 2.75f, 2.75f)
            horizontalLineToRelative(3f)
            curveToRelative(1.519f, 0f, 2.75f, -1.231f, 2.75f, -2.75f)
            verticalLineTo(5.75f)
            curveTo(24f, 4.231f, 22.769f, 3f, 21.25f, 3f)
            horizontalLineToRelative(-3f)
            close()
        }
    }.build()
}
