package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableBottomRow16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableBottomRow16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineTo(10f)
            horizontalLineToRelative(1f)
            verticalLineTo(4.5f)
            curveTo(3f, 3.672f, 3.672f, 3f, 4.5f, 3f)
            horizontalLineToRelative(7f)
            curveTo(12.328f, 3f, 13f, 3.672f, 13f, 4.5f)
            verticalLineTo(10f)
            horizontalLineToRelative(1f)
            verticalLineTo(4.5f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-7f)
            close()
            moveTo(3f, 13.5f)
            curveToRelative(-0.48f, -0.36f, -0.826f, -0.89f, -0.95f, -1.5f)
            curveTo(2.017f, 11.838f, 2f, 11.671f, 2f, 11.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(3f)
            horizontalLineTo(4.5f)
            curveToRelative(-0.563f, 0f, -1.082f, -0.186f, -1.5f, -0.5f)
            close()
            moveTo(13.95f, 12f)
            curveToRelative(0.033f, -0.162f, 0.05f, -0.329f, 0.05f, -0.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.563f, 0f, 1.082f, -0.186f, 1.5f, -0.5f)
            curveToRelative(0.48f, -0.36f, 0.826f, -0.89f, 0.95f, -1.5f)
            close()
            moveTo(6f, 14f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(-3f)
            horizontalLineTo(6f)
            verticalLineToRelative(3f)
            close()
        }
    }.build()
}
