package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextUnderlineCharacterU24: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextUnderlineCharacterU24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 4.75f)
            curveTo(8.5f, 4.336f, 8.164f, 4f, 7.75f, 4f)
            reflectiveCurveTo(7f, 4.336f, 7f, 4.75f)
            verticalLineTo(12f)
            curveToRelative(0f, 2.761f, 2.239f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.239f, 5f, -5f)
            verticalLineTo(4.75f)
            curveTo(17f, 4.336f, 16.664f, 4f, 16.25f, 4f)
            reflectiveCurveTo(15.5f, 4.336f, 15.5f, 4.75f)
            verticalLineTo(12f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveTo(8.5f, 13.933f, 8.5f, 12f)
            verticalLineTo(4.75f)
            close()
            moveTo(6.75f, 18.5f)
            curveTo(6.336f, 18.5f, 6f, 18.836f, 6f, 19.25f)
            reflectiveCurveTo(6.336f, 20f, 6.75f, 20f)
            horizontalLineToRelative(10.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(6.75f)
            close()
        }
    }.build()
}
