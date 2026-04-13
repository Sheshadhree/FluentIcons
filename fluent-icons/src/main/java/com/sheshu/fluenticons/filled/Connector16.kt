package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Connector16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Connector16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 3f)
            curveTo(3.224f, 3f, 3f, 3.224f, 3f, 3.5f)
            verticalLineToRelative(1.882f)
            lineTo(2.053f, 7.276f)
            curveTo(2.018f, 7.346f, 2f, 7.422f, 2f, 7.5f)
            verticalLineToRelative(3f)
            curveTo(2f, 10.776f, 2.224f, 11f, 2.5f, 11f)
            horizontalLineTo(3f)
            verticalLineToRelative(1.5f)
            curveTo(3f, 12.776f, 3.224f, 13f, 3.5f, 13f)
            reflectiveCurveTo(4f, 12.776f, 4f, 12.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(1.5f)
            curveTo(5f, 12.776f, 5.224f, 13f, 5.5f, 13f)
            reflectiveCurveTo(6f, 12.776f, 6f, 12.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(0.5f)
            curveTo(6.776f, 11f, 7f, 10.776f, 7f, 10.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.078f, -0.018f, -0.154f, -0.053f, -0.224f)
            lineTo(6f, 5.382f)
            verticalLineTo(3.5f)
            curveTo(6f, 3.224f, 5.776f, 3f, 5.5f, 3f)
            horizontalLineToRelative(-2f)
            close()
            moveToRelative(9f, 10f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            verticalLineToRelative(-1.882f)
            lineTo(9.053f, 8.724f)
            curveTo(9.018f, 8.654f, 9f, 8.578f, 9f, 8.5f)
            verticalLineToRelative(-3f)
            curveTo(9f, 5.224f, 9.224f, 5f, 9.5f, 5f)
            horizontalLineTo(10f)
            verticalLineTo(3.5f)
            curveTo(10f, 3.224f, 10.224f, 3f, 10.5f, 3f)
            horizontalLineToRelative(2f)
            curveTo(12.776f, 3f, 13f, 3.224f, 13f, 3.5f)
            verticalLineTo(5f)
            horizontalLineToRelative(0.5f)
            curveTo(13.776f, 5f, 14f, 5.224f, 14f, 5.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.078f, -0.018f, 0.154f, -0.053f, 0.224f)
            lineTo(13f, 10.618f)
            verticalLineTo(12.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            close()
            moveTo(11f, 5f)
            horizontalLineToRelative(1f)
            verticalLineTo(4f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(1f)
            close()
        }
    }.build()
}
