package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.InkingToolAccent20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.InkingToolAccent20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 6f)
            verticalLineTo(3f)
            horizontalLineTo(3f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(13f)
            curveTo(16.776f, 6.5f, 17f, 6.276f, 17f, 6f)
            close()
            moveToRelative(-4.554f, 1f)
            lineToRelative(-2.388f, 4.776f)
            curveTo(9.892f, 12.11f, 10.133f, 12.5f, 10.505f, 12.5f)
            curveToRelative(0.19f, 0f, 0.363f, -0.107f, 0.447f, -0.276f)
            lineTo(13.564f, 7f)
            lineTo(13f, 6.5f)
            lineTo(12.446f, 7f)
            close()
            moveTo(10f, 17.5f)
            curveToRelative(0.552f, 0f, 1f, -0.672f, 1f, -1.5f)
            reflectiveCurveToRelative(-0.448f, -1.5f, -1f, -1.5f)
            reflectiveCurveToRelative(-1f, 0.672f, -1f, 1.5f)
            reflectiveCurveToRelative(0.448f, 1.5f, 1f, 1.5f)
            close()
        }
    }.build()
}
