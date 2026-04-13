package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableStackAbove16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableStackAbove16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 2f)
            curveTo(2.224f, 2f, 2f, 2.224f, 2f, 2.5f)
            reflectiveCurveTo(2.224f, 3f, 2.5f, 3f)
            horizontalLineToRelative(11f)
            curveTo(13.776f, 3f, 14f, 2.776f, 14f, 2.5f)
            reflectiveCurveTo(13.776f, 2f, 13.5f, 2f)
            horizontalLineToRelative(-11f)
            close()
            moveTo(11f, 6f)
            horizontalLineToRelative(2.5f)
            curveTo(13.776f, 6f, 14f, 6.224f, 14f, 6.5f)
            verticalLineTo(10f)
            horizontalLineToRelative(-3f)
            verticalLineTo(6f)
            close()
            moveToRelative(-1f, 0f)
            horizontalLineTo(6f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(4f)
            verticalLineTo(6f)
            close()
            moveToRelative(-8f, 4f)
            verticalLineTo(6.5f)
            curveTo(2f, 6.224f, 2.224f, 6f, 2.5f, 6f)
            horizontalLineTo(5f)
            verticalLineToRelative(4f)
            horizontalLineTo(2f)
            close()
            moveToRelative(3f, 1f)
            horizontalLineTo(2f)
            verticalLineToRelative(0.5f)
            curveTo(2f, 12.88f, 3.12f, 14f, 4.5f, 14f)
            horizontalLineTo(5f)
            verticalLineToRelative(-3f)
            close()
            moveToRelative(1f, 3f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(-3f)
            horizontalLineTo(6f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(5.5f, 0f)
            horizontalLineTo(11f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
        }
    }.build()
}
