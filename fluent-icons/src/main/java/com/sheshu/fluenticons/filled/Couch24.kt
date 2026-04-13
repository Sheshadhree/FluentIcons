package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Couch24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Couch24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.75f, 4f)
            horizontalLineToRelative(-9.5f)
            curveTo(5.731f, 4f, 4.5f, 5.231f, 4.5f, 6.75f)
            verticalLineTo(8f)
            curveToRelative(1.763f, 0f, 3.222f, 1.304f, 3.465f, 3f)
            horizontalLineToRelative(8.07f)
            curveToRelative(0.243f, -1.696f, 1.702f, -3f, 3.465f, -3f)
            verticalLineTo(6.75f)
            curveTo(19.5f, 5.231f, 18.269f, 4f, 16.75f, 4f)
            close()
            moveTo(17f, 11.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(2.75f)
            curveToRelative(0f, 1.434f, -1.098f, 2.613f, -2.5f, 2.739f)
            verticalLineToRelative(1.261f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(18f, 18.664f, 18f, 18.25f)
            verticalLineTo(17f)
            horizontalLineTo(6f)
            verticalLineToRelative(1.25f)
            curveTo(6f, 18.664f, 5.664f, 19f, 5.25f, 19f)
            reflectiveCurveTo(4.5f, 18.664f, 4.5f, 18.25f)
            verticalLineToRelative(-1.261f)
            curveTo(3.098f, 16.862f, 2f, 15.684f, 2f, 14.25f)
            verticalLineTo(11.5f)
            curveTo(2f, 10.12f, 3.12f, 9f, 4.5f, 9f)
            reflectiveCurveTo(7f, 10.12f, 7f, 11.5f)
            curveTo(7f, 11.776f, 7.224f, 12f, 7.5f, 12f)
            horizontalLineToRelative(9f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            close()
        }
    }.build()
}
