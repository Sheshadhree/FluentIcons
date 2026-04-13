package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Clover16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Clover16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 1f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            reflectiveCurveToRelative(-1.343f, 3f, -3f, 3f)
            horizontalLineTo(8.5f)
            curveTo(8.224f, 7f, 8f, 6.776f, 8f, 6.5f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            close()
            moveTo(4f, 1.02f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            reflectiveCurveToRelative(1.343f, 3f, 3f, 3f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            close()
            moveTo(4f, 14f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(2.5f)
            curveTo(6.776f, 8f, 7f, 8.224f, 7f, 8.5f)
            verticalLineTo(11f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            close()
            moveToRelative(7f, 0f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            horizontalLineTo(8.5f)
            curveTo(8.224f, 8f, 8f, 8.224f, 8f, 8.5f)
            verticalLineTo(11f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            close()
        }
    }.build()
}
