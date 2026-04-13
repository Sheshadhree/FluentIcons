package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CloudWords16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CloudWords16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 3f)
            curveTo(5.958f, 3f, 4.273f, 4.53f, 4.03f, 6.507f)
            curveTo(2.338f, 6.62f, 1f, 8.03f, 1f, 9.75f)
            curveTo(1f, 11.545f, 2.455f, 13f, 4.25f, 13f)
            horizontalLineToRelative(7.5f)
            curveTo(13.545f, 13f, 15f, 11.545f, 15f, 9.75f)
            curveToRelative(0f, -1.721f, -1.338f, -3.13f, -3.03f, -3.243f)
            curveTo(11.727f, 4.531f, 10.042f, 3f, 8f, 3f)
            close()
            moveTo(7f, 6f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(9.276f, 7f, 9f, 7f)
            horizontalLineTo(7f)
            curveTo(6.724f, 7f, 6.5f, 6.776f, 6.5f, 6.5f)
            reflectiveCurveTo(6.724f, 6f, 7f, 6f)
            close()
            moveTo(4f, 9.5f)
            curveTo(4f, 9.224f, 4.224f, 9f, 4.5f, 9f)
            horizontalLineToRelative(2f)
            curveTo(6.776f, 9f, 7f, 9.224f, 7f, 9.5f)
            reflectiveCurveTo(6.776f, 10f, 6.5f, 10f)
            horizontalLineToRelative(-2f)
            curveTo(4.224f, 10f, 4f, 9.776f, 4f, 9.5f)
            close()
            moveTo(9.5f, 9f)
            horizontalLineToRelative(2f)
            curveTo(11.776f, 9f, 12f, 9.224f, 12f, 9.5f)
            reflectiveCurveTo(11.776f, 10f, 11.5f, 10f)
            horizontalLineToRelative(-2f)
            curveTo(9.224f, 10f, 9f, 9.776f, 9f, 9.5f)
            reflectiveCurveTo(9.224f, 9f, 9.5f, 9f)
            close()
        }
    }.build()
}
