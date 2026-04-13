package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableSimple20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableSimple20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 3f)
            curveTo(4.12f, 3f, 3f, 4.12f, 3f, 5.5f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(6.5f)
            verticalLineTo(3f)
            horizontalLineToRelative(-4f)
            close()
            moveToRelative(4f, 7.5f)
            horizontalLineTo(3f)
            verticalLineToRelative(4f)
            curveTo(3f, 15.88f, 4.12f, 17f, 5.5f, 17f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(-6.5f)
            close()
            moveToRelative(1f, 0f)
            horizontalLineTo(17f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-6.5f)
            close()
            moveToRelative(6.5f, -1f)
            verticalLineToRelative(-4f)
            curveTo(17f, 4.12f, 15.88f, 3f, 14.5f, 3f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(6.5f)
            horizontalLineTo(17f)
            close()
        }
    }.build()
}
