package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableBottomRow28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableBottomRow28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.75f, 3f)
            curveTo(4.679f, 3f, 3f, 4.679f, 3f, 6.75f)
            verticalLineTo(17f)
            horizontalLineToRelative(1.5f)
            verticalLineTo(6.75f)
            curveToRelative(0f, -1.243f, 1.007f, -2.25f, 2.25f, -2.25f)
            horizontalLineToRelative(14.5f)
            curveToRelative(1.243f, 0f, 2.25f, 1.007f, 2.25f, 2.25f)
            verticalLineTo(17f)
            horizontalLineTo(25f)
            verticalLineTo(6.75f)
            curveTo(25f, 4.679f, 23.321f, 3f, 21.25f, 3f)
            horizontalLineTo(6.75f)
            close()
            moveTo(3f, 21.25f)
            curveTo(3f, 23.321f, 4.679f, 25f, 6.75f, 25f)
            horizontalLineTo(9.5f)
            verticalLineToRelative(-6.5f)
            horizontalLineTo(3f)
            verticalLineToRelative(2.75f)
            close()
            moveTo(17f, 25f)
            horizontalLineToRelative(-6f)
            verticalLineToRelative(-6.5f)
            horizontalLineToRelative(6f)
            verticalLineTo(25f)
            close()
            moveToRelative(4.25f, 0f)
            horizontalLineTo(18.5f)
            verticalLineToRelative(-6.5f)
            horizontalLineTo(25f)
            verticalLineToRelative(2.75f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            close()
        }
    }.build()
}
