package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Board28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Board28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 3f)
            verticalLineToRelative(6.5f)
            horizontalLineTo(3f)
            verticalLineTo(6.75f)
            curveTo(3f, 4.679f, 4.679f, 3f, 6.75f, 3f)
            horizontalLineToRelative(6.75f)
            close()
            moveTo(15f, 3f)
            verticalLineToRelative(13.5f)
            horizontalLineToRelative(10f)
            verticalLineTo(6.75f)
            curveTo(25f, 4.679f, 23.321f, 3f, 21.25f, 3f)
            horizontalLineTo(15f)
            close()
            moveToRelative(10f, 15f)
            horizontalLineTo(15f)
            verticalLineToRelative(7f)
            horizontalLineToRelative(6.25f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineTo(18f)
            close()
            moveToRelative(-11.5f, 7f)
            verticalLineTo(11f)
            horizontalLineTo(3f)
            verticalLineToRelative(10.25f)
            curveTo(3f, 23.321f, 4.679f, 25f, 6.75f, 25f)
            horizontalLineToRelative(6.75f)
            close()
        }
    }.build()
}
