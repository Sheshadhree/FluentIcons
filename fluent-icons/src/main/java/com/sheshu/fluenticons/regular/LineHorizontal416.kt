package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.LineHorizontal416: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.LineHorizontal416",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 3f)
            curveTo(2.224f, 3f, 2f, 3.224f, 2f, 3.5f)
            reflectiveCurveTo(2.224f, 4f, 2.5f, 4f)
            horizontalLineToRelative(11f)
            curveTo(13.776f, 4f, 14f, 3.776f, 14f, 3.5f)
            reflectiveCurveTo(13.776f, 3f, 13.5f, 3f)
            horizontalLineToRelative(-11f)
            close()
            moveToRelative(0f, 3f)
            curveTo(2.224f, 6f, 2f, 6.224f, 2f, 6.5f)
            reflectiveCurveTo(2.224f, 7f, 2.5f, 7f)
            horizontalLineToRelative(11f)
            curveTo(13.776f, 7f, 14f, 6.776f, 14f, 6.5f)
            reflectiveCurveTo(13.776f, 6f, 13.5f, 6f)
            horizontalLineToRelative(-11f)
            close()
            moveTo(2f, 9.5f)
            curveTo(2f, 9.224f, 2.224f, 9f, 2.5f, 9f)
            horizontalLineToRelative(11f)
            curveTo(13.776f, 9f, 14f, 9.224f, 14f, 9.5f)
            reflectiveCurveTo(13.776f, 10f, 13.5f, 10f)
            horizontalLineToRelative(-11f)
            curveTo(2.224f, 10f, 2f, 9.776f, 2f, 9.5f)
            close()
            moveTo(2.5f, 12f)
            curveTo(2.224f, 12f, 2f, 12.224f, 2f, 12.5f)
            reflectiveCurveTo(2.224f, 13f, 2.5f, 13f)
            horizontalLineToRelative(11f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.776f, 12f, 13.5f, 12f)
            horizontalLineToRelative(-11f)
            close()
        }
    }.build()
}
