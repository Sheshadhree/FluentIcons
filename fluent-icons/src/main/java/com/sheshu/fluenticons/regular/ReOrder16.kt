package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ReOrder16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ReOrder16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 9f)
            horizontalLineToRelative(11f)
            curveTo(13.776f, 9f, 14f, 9.224f, 14f, 9.5f)
            curveToRelative(0f, 0.245f, -0.177f, 0.45f, -0.41f, 0.492f)
            lineTo(13.5f, 10f)
            horizontalLineToRelative(-11f)
            curveTo(2.224f, 10f, 2f, 9.776f, 2f, 9.5f)
            curveToRelative(0f, -0.245f, 0.177f, -0.45f, 0.41f, -0.492f)
            lineTo(2.5f, 9f)
            horizontalLineToRelative(11f)
            horizontalLineToRelative(-11f)
            close()
            moveToRelative(0f, -3f)
            horizontalLineToRelative(11f)
            curveTo(13.776f, 6f, 14f, 6.224f, 14f, 6.5f)
            curveToRelative(0f, 0.245f, -0.177f, 0.45f, -0.41f, 0.492f)
            lineTo(13.5f, 7f)
            horizontalLineToRelative(-11f)
            curveTo(2.224f, 7f, 2f, 6.776f, 2f, 6.5f)
            curveToRelative(0f, -0.245f, 0.177f, -0.45f, 0.41f, -0.492f)
            lineTo(2.5f, 6f)
            horizontalLineToRelative(11f)
            horizontalLineToRelative(-11f)
            close()
        }
    }.build()
}
