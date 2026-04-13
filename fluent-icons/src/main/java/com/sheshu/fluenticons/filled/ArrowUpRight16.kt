package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowUpRight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowUpRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 2.75f)
            curveTo(7f, 2.336f, 7.335f, 2f, 7.75f, 2f)
            horizontalLineToRelative(5.5f)
            curveTo(13.664f, 2f, 14f, 2.336f, 14f, 2.75f)
            verticalLineToRelative(5.5f)
            curveTo(14f, 8.664f, 13.664f, 9f, 13.25f, 9f)
            curveToRelative(-0.415f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(4.56f)
            lineToRelative(-9.22f, 9.22f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(9.22f, -9.22f)
            horizontalLineTo(7.75f)
            curveTo(7.335f, 3.5f, 7f, 3.164f, 7f, 2.75f)
            close()
        }
    }.build()
}
