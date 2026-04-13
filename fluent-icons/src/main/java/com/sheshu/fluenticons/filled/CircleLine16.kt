package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CircleLine16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CircleLine16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.98f, 8.5f)
            curveTo(13.724f, 11.58f, 11.144f, 14f, 8f, 14f)
            curveToRelative(-3.145f, 0f, -5.725f, -2.42f, -5.98f, -5.5f)
            horizontalLineToRelative(11.96f)
            close()
            moveToRelative(0f, -1f)
            horizontalLineTo(2.02f)
            curveTo(2.276f, 4.42f, 4.856f, 2f, 8f, 2f)
            curveToRelative(3.145f, 0f, 5.725f, 2.42f, 5.98f, 5.5f)
            close()
        }
    }.build()
}
