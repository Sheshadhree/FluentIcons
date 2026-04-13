package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MyLocation16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MyLocation16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 10.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveTo(9.38f, 5.5f, 8f, 5.5f)
            reflectiveCurveTo(5.5f, 6.62f, 5.5f, 8f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            close()
            moveToRelative(0.5f, -9f)
            curveTo(8.5f, 1.224f, 8.276f, 1f, 8f, 1f)
            reflectiveCurveTo(7.5f, 1.224f, 7.5f, 1.5f)
            verticalLineToRelative(1.525f)
            curveTo(5.138f, 3.259f, 3.26f, 5.138f, 3.025f, 7.5f)
            horizontalLineTo(1.5f)
            curveTo(1.224f, 7.5f, 1f, 7.724f, 1f, 8f)
            reflectiveCurveToRelative(0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(1.525f)
            curveToRelative(0.234f, 2.362f, 2.113f, 4.241f, 4.475f, 4.476f)
            verticalLineTo(14.5f)
            curveTo(7.5f, 14.776f, 7.724f, 15f, 8f, 15f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-1.524f)
            curveToRelative(2.362f, -0.235f, 4.24f, -2.114f, 4.475f, -4.476f)
            horizontalLineTo(14.5f)
            curveTo(14.776f, 8.5f, 15f, 8.276f, 15f, 8f)
            reflectiveCurveToRelative(-0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineToRelative(-1.525f)
            curveTo(12.741f, 5.138f, 10.862f, 3.26f, 8.5f, 3.025f)
            verticalLineTo(1.5f)
            close()
            moveTo(8f, 12f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            curveToRelative(0f, -2.209f, 1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.791f, 4f, 4f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            close()
        }
    }.build()
}
