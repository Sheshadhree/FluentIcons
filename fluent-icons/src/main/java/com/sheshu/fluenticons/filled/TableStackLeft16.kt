package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableStackLeft16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableStackLeft16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 13.5f)
            curveTo(2f, 13.776f, 2.224f, 14f, 2.5f, 14f)
            reflectiveCurveTo(3f, 13.776f, 3f, 13.5f)
            verticalLineToRelative(-11f)
            curveTo(3f, 2.224f, 2.776f, 2f, 2.5f, 2f)
            reflectiveCurveTo(2f, 2.224f, 2f, 2.5f)
            verticalLineToRelative(11f)
            close()
            moveTo(6f, 5f)
            verticalLineTo(2.5f)
            curveTo(6f, 2.224f, 6.224f, 2f, 6.5f, 2f)
            horizontalLineTo(10f)
            verticalLineToRelative(3f)
            horizontalLineTo(6f)
            close()
            moveToRelative(0f, 1f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(4f)
            verticalLineTo(6f)
            horizontalLineTo(6f)
            close()
            moveToRelative(4f, 8f)
            horizontalLineTo(6.5f)
            curveTo(6.224f, 14f, 6f, 13.776f, 6f, 13.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(3f)
            close()
            moveToRelative(1f, -3f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(0.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(3f, -1f)
            verticalLineTo(6f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(3f)
            close()
            moveToRelative(0f, -5.5f)
            verticalLineTo(5f)
            horizontalLineToRelative(-3f)
            verticalLineTo(2f)
            horizontalLineToRelative(0.5f)
            curveTo(12.88f, 2f, 14f, 3.12f, 14f, 4.5f)
            close()
        }
    }.build()
}
