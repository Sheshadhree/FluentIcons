package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableSplit20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableSplit20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 6f)
            horizontalLineToRelative(4f)
            verticalLineTo(2f)
            horizontalLineTo(8f)
            verticalLineToRelative(4f)
            close()
            moveTo(7f, 2f)
            horizontalLineTo(3.5f)
            curveTo(3.224f, 2f, 3f, 2.224f, 3f, 2.5f)
            verticalLineTo(4f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(2f)
            verticalLineTo(2f)
            close()
            moveToRelative(6f, 4f)
            horizontalLineToRelative(2f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(2.5f)
            curveTo(17f, 2.224f, 16.776f, 2f, 16.5f, 2f)
            horizontalLineTo(13f)
            verticalLineToRelative(4f)
            close()
            moveToRelative(4f, 11.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineTo(13f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(2f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(1.5f)
            close()
            moveTo(12f, 14f)
            verticalLineToRelative(4f)
            horizontalLineTo(8f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(4f)
            close()
            moveToRelative(-8.5f, 4f)
            horizontalLineTo(7f)
            verticalLineToRelative(-4f)
            horizontalLineTo(5f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(1.5f)
            curveTo(3f, 17.776f, 3.224f, 18f, 3.5f, 18f)
            close()
            moveToRelative(-1f, -8.5f)
            horizontalLineToRelative(15.005f)
            curveToRelative(0.279f, 0f, 0.503f, 0.227f, 0.5f, 0.505f)
            curveToRelative(-0.003f, 0.274f, -0.226f, 0.495f, -0.5f, 0.495f)
            horizontalLineTo(2.5f)
            curveTo(2.224f, 10.5f, 2f, 10.276f, 2f, 10f)
            reflectiveCurveToRelative(0.224f, -0.5f, 0.5f, -0.5f)
            close()
        }
    }.build()
}
