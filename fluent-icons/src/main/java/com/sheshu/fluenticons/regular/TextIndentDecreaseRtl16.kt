package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextIndentDecreaseRtl16: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextIndentDecreaseRtl16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 3.5f)
            curveTo(4f, 3.224f, 4.224f, 3f, 4.5f, 3f)
            horizontalLineToRelative(6f)
            curveTo(10.776f, 3f, 11f, 3.224f, 11f, 3.5f)
            reflectiveCurveTo(10.776f, 4f, 10.5f, 4f)
            horizontalLineToRelative(-6f)
            curveTo(4.224f, 4f, 4f, 3.776f, 4f, 3.5f)
            close()
            moveToRelative(8.646f, 2.146f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineToRelative(1.5f, 1.5f)
            curveToRelative(0.195f, 0.196f, 0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(-1.5f, 1.5f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.707f)
            lineTo(13.793f, 7.5f)
            lineToRelative(-1.147f, -1.146f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            close()
            moveTo(1f, 7.5f)
            curveTo(1f, 7.224f, 1.224f, 7f, 1.5f, 7f)
            horizontalLineToRelative(9f)
            curveTo(10.776f, 7f, 11f, 7.224f, 11f, 7.5f)
            reflectiveCurveTo(10.776f, 8f, 10.5f, 8f)
            horizontalLineToRelative(-9f)
            curveTo(1.224f, 8f, 1f, 7.776f, 1f, 7.5f)
            close()
            moveToRelative(5f, 4f)
            curveTo(6f, 11.224f, 6.224f, 11f, 6.5f, 11f)
            horizontalLineToRelative(4f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(10.776f, 12f, 10.5f, 12f)
            horizontalLineToRelative(-4f)
            curveTo(6.224f, 12f, 6f, 11.776f, 6f, 11.5f)
            close()
        }
    }.build()
}
