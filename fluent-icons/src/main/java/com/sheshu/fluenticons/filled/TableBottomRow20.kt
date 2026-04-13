package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableBottomRow20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableBottomRow20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.5f, 3f)
            curveTo(15.88f, 3f, 17f, 4.12f, 17f, 5.5f)
            verticalLineTo(12f)
            horizontalLineToRelative(-1f)
            verticalLineTo(5.5f)
            curveToRelative(0f, -0.78f, -0.595f, -1.42f, -1.355f, -1.493f)
            lineTo(14.5f, 4f)
            horizontalLineToRelative(-9f)
            curveTo(4.72f, 4f, 4.08f, 4.595f, 4.007f, 5.356f)
            lineTo(4f, 5.5f)
            verticalLineTo(12f)
            horizontalLineTo(3f)
            verticalLineTo(5.5f)
            curveTo(3f, 4.12f, 4.12f, 3f, 5.5f, 3f)
            horizontalLineToRelative(9f)
            close()
            moveTo(17f, 14.5f)
            curveToRelative(0f, 0.818f, -0.393f, 1.544f, -1f, 2f)
            curveToRelative(-0.418f, 0.314f, -0.937f, 0.5f, -1.5f, 0.5f)
            horizontalLineTo(13f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(1.5f)
            close()
            moveToRelative(-13f, 2f)
            curveTo(4.418f, 16.814f, 4.937f, 17f, 5.5f, 17f)
            horizontalLineTo(7f)
            verticalLineToRelative(-4f)
            horizontalLineTo(3f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.818f, 0.393f, 1.544f, 1f, 2f)
            close()
            moveTo(8f, 13f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            horizontalLineTo(8f)
            verticalLineToRelative(-4f)
            close()
        }
    }.build()
}
