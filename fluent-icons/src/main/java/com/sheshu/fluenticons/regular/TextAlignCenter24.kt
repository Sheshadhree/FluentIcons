package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextAlignCenter24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextAlignCenter24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 5.75f)
            curveTo(4f, 5.336f, 4.336f, 5f, 4.75f, 5f)
            horizontalLineToRelative(14.5f)
            curveTo(19.664f, 5f, 20f, 5.336f, 20f, 5.75f)
            reflectiveCurveTo(19.664f, 6.5f, 19.25f, 6.5f)
            horizontalLineTo(4.75f)
            curveTo(4.336f, 6.5f, 4f, 6.164f, 4f, 5.75f)
            close()
            moveToRelative(2f, 13f)
            curveTo(6f, 18.336f, 6.336f, 18f, 6.75f, 18f)
            horizontalLineToRelative(10.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 19.5f, 6f, 19.164f, 6f, 18.75f)
            close()
            moveTo(2.75f, 11.5f)
            curveTo(2.336f, 11.5f, 2f, 11.836f, 2f, 12.25f)
            reflectiveCurveTo(2.336f, 13f, 2.75f, 13f)
            horizontalLineToRelative(18.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(2.75f)
            close()
        }
    }.build()
}
