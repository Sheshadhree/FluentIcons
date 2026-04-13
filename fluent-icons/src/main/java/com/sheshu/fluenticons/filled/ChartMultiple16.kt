package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ChartMultiple16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChartMultiple16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 7f)
            curveToRelative(0f, -0.684f, 0.343f, -1.287f, 0.866f, -1.648f)
            curveTo(12.31f, 2.862f, 10.086f, 1f, 7.43f, 1f)
            curveTo(7.187f, 1f, 7f, 1.203f, 7f, 1.445f)
            verticalLineTo(6.5f)
            curveTo(7f, 6.776f, 7.224f, 7f, 7.5f, 7f)
            horizontalLineTo(12f)
            close()
            moveTo(1f, 7.5f)
            curveToRelative(0f, 2.87f, 2.197f, 5.226f, 5f, 5.478f)
            verticalLineTo(11f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            curveToRelative(0.364f, 0f, 0.706f, 0.097f, 1f, 0.268f)
            verticalLineTo(9f)
            curveToRelative(0f, -0.364f, 0.097f, -0.706f, 0.268f, -1f)
            horizontalLineTo(7f)
            curveTo(6.448f, 8f, 6f, 7.552f, 6f, 7f)
            verticalLineTo(2.571f)
            curveToRelative(0f, -0.294f, -0.253f, -0.526f, -0.542f, -0.47f)
            curveTo(2.918f, 2.586f, 1f, 4.82f, 1f, 7.5f)
            close()
            moveTo(14f, 6f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineTo(7f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            close()
            moveToRelative(-3f, 2f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineTo(9f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            close()
            moveToRelative(-4f, 3f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-3f)
            close()
        }
    }.build()
}
