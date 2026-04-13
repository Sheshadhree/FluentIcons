package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Board20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Board20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 3f)
            verticalLineToRelative(4f)
            horizontalLineTo(3f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(3.5f)
            close()
            moveToRelative(1f, 0f)
            verticalLineToRelative(9f)
            horizontalLineTo(17f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineToRelative(-3.5f)
            close()
            moveTo(17f, 13f)
            horizontalLineToRelative(-6.5f)
            verticalLineToRelative(4f)
            horizontalLineTo(14f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            verticalLineToRelative(-1f)
            close()
            moveToRelative(-7.5f, 4f)
            verticalLineTo(8f)
            horizontalLineTo(3f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(3.5f)
            close()
        }
    }.build()
}
