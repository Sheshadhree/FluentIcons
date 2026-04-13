package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextAlignJustify20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextAlignJustify20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 4.25f)
            curveTo(2f, 3.836f, 2.336f, 3.5f, 2.75f, 3.5f)
            horizontalLineToRelative(14.5f)
            curveTo(17.664f, 3.5f, 18f, 3.836f, 18f, 4.25f)
            reflectiveCurveTo(17.664f, 5f, 17.25f, 5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 5f, 2f, 4.664f, 2f, 4.25f)
            close()
            moveToRelative(0f, 5f)
            curveTo(2f, 8.836f, 2.336f, 8.5f, 2.75f, 8.5f)
            horizontalLineToRelative(14.5f)
            curveTo(17.664f, 8.5f, 18f, 8.836f, 18f, 9.25f)
            reflectiveCurveTo(17.664f, 10f, 17.25f, 10f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 10f, 2f, 9.664f, 2f, 9.25f)
            close()
            moveToRelative(0.75f, 4.25f)
            curveTo(2.336f, 13.5f, 2f, 13.836f, 2f, 14.25f)
            reflectiveCurveTo(2.336f, 15f, 2.75f, 15f)
            horizontalLineToRelative(14.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(2.75f)
            close()
        }
    }.build()
}
