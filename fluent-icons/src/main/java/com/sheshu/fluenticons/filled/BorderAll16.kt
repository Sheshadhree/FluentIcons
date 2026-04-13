package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BorderAll16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BorderAll16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.75f, 3.5f)
            curveTo(4.06f, 3.5f, 3.5f, 4.06f, 3.5f, 4.75f)
            verticalLineToRelative(2.5f)
            horizontalLineToRelative(3.75f)
            verticalLineTo(3.5f)
            horizontalLineToRelative(-2.5f)
            close()
            moveToRelative(4f, 0f)
            verticalLineToRelative(3.75f)
            horizontalLineToRelative(3.75f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineToRelative(-2.5f)
            close()
            moveToRelative(3.75f, 5.25f)
            horizontalLineTo(8.75f)
            verticalLineToRelative(3.75f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            verticalLineToRelative(-2.5f)
            close()
            moveTo(7.25f, 12.5f)
            verticalLineTo(8.75f)
            horizontalLineTo(3.5f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(2.5f)
            close()
            moveTo(2f, 4.75f)
            curveTo(2f, 3.231f, 3.231f, 2f, 4.75f, 2f)
            horizontalLineToRelative(6.5f)
            curveTo(12.769f, 2f, 14f, 3.231f, 14f, 4.75f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineToRelative(-6.5f)
            curveTo(3.231f, 14f, 2f, 12.769f, 2f, 11.25f)
            verticalLineToRelative(-6.5f)
            close()
        }
    }.build()
}
