package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LayoutRowFour20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LayoutRowFour20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 14f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(8f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            horizontalLineTo(3f)
            close()
            moveToRelative(14f, -1f)
            verticalLineToRelative(-2.5f)
            horizontalLineTo(3f)
            verticalLineTo(13f)
            horizontalLineToRelative(14f)
            close()
            moveToRelative(0f, -6f)
            verticalLineToRelative(2.5f)
            horizontalLineTo(3f)
            verticalLineTo(7f)
            horizontalLineToRelative(14f)
            close()
            moveToRelative(0f, -1f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(6f)
            curveTo(4.343f, 3f, 3f, 4.343f, 3f, 6f)
            horizontalLineToRelative(14f)
            close()
        }
    }.build()
}
