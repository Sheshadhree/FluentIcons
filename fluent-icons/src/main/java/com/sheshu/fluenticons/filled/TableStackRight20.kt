package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableStackRight20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableStackRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 3.5f)
            curveTo(17f, 3.224f, 16.776f, 3f, 16.5f, 3f)
            reflectiveCurveTo(16f, 3.224f, 16f, 3.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-13f)
            close()
            moveTo(3f, 15f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(4f)
            horizontalLineTo(5f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            close()
            moveToRelative(5f, 2f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineTo(8f)
            close()
            moveToRelative(0f, -5f)
            horizontalLineToRelative(4f)
            verticalLineTo(8f)
            horizontalLineTo(8f)
            verticalLineToRelative(4f)
            close()
            moveTo(3f, 8f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(4f)
            verticalLineTo(8f)
            horizontalLineTo(3f)
            close()
            moveToRelative(9f, -1f)
            horizontalLineTo(8f)
            verticalLineTo(3f)
            horizontalLineToRelative(3.5f)
            curveTo(11.776f, 3f, 12f, 3.224f, 12f, 3.5f)
            verticalLineTo(7f)
            close()
            moveTo(3f, 7f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(4f)
            horizontalLineTo(3f)
            close()
        }
    }.build()
}
