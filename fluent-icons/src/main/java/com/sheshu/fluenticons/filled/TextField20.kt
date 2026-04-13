package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextField20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextField20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(10f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(5f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(6f)
            close()
            moveToRelative(4f, -0.5f)
            verticalLineToRelative(1f)
            curveTo(6f, 6.776f, 6.224f, 7f, 6.5f, 7f)
            reflectiveCurveTo(7f, 6.776f, 7f, 6.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(2.5f)
            verticalLineToRelative(8f)
            horizontalLineTo(9f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            reflectiveCurveTo(8.724f, 15f, 9f, 15f)
            horizontalLineToRelative(2f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(11.276f, 14f, 11f, 14f)
            horizontalLineToRelative(-0.5f)
            verticalLineTo(6f)
            horizontalLineTo(13f)
            verticalLineToRelative(0.5f)
            curveTo(13f, 6.776f, 13.224f, 7f, 13.5f, 7f)
            reflectiveCurveTo(14f, 6.776f, 14f, 6.5f)
            verticalLineToRelative(-1f)
            curveTo(14f, 5.224f, 13.776f, 5f, 13.5f, 5f)
            horizontalLineToRelative(-7f)
            curveTo(6.224f, 5f, 6f, 5.224f, 6f, 5.5f)
            close()
        }
    }.build()
}
