package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableSimple28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableSimple28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 6.75f)
            curveTo(3f, 4.679f, 4.679f, 3f, 6.75f, 3f)
            horizontalLineToRelative(6.5f)
            verticalLineToRelative(10.25f)
            horizontalLineTo(3f)
            verticalLineToRelative(-6.5f)
            close()
            moveToRelative(0f, 8f)
            verticalLineToRelative(6.5f)
            curveTo(3f, 23.321f, 4.679f, 25f, 6.75f, 25f)
            horizontalLineToRelative(6.5f)
            verticalLineTo(14.75f)
            horizontalLineTo(3f)
            close()
            moveTo(14.75f, 25f)
            horizontalLineToRelative(6.5f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineToRelative(-6.5f)
            horizontalLineTo(14.75f)
            verticalLineTo(25f)
            close()
            moveTo(25f, 13.25f)
            verticalLineToRelative(-6.5f)
            curveTo(25f, 4.679f, 23.321f, 3f, 21.25f, 3f)
            horizontalLineToRelative(-6.5f)
            verticalLineToRelative(10.25f)
            horizontalLineTo(25f)
            close()
        }
    }.build()
}
