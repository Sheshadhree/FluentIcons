package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextAlignCenterRotate9024: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextAlignCenterRotate9024",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.25f, 4f)
            curveTo(18.664f, 4f, 19f, 4.336f, 19f, 4.75f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(4.75f)
            curveTo(17.5f, 4.336f, 17.836f, 4f, 18.25f, 4f)
            close()
            moveToRelative(-13f, 2f)
            curveTo(5.664f, 6f, 6f, 6.336f, 6f, 6.75f)
            verticalLineToRelative(10.5f)
            curveTo(6f, 17.664f, 5.664f, 18f, 5.25f, 18f)
            reflectiveCurveTo(4.5f, 17.664f, 4.5f, 17.25f)
            verticalLineTo(6.75f)
            curveTo(4.5f, 6.336f, 4.836f, 6f, 5.25f, 6f)
            close()
            moveToRelative(7.25f, -3.25f)
            curveTo(12.5f, 2.336f, 12.164f, 2f, 11.75f, 2f)
            reflectiveCurveTo(11f, 2.336f, 11f, 2.75f)
            verticalLineToRelative(18.5f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(2.75f)
            close()
        }
    }.build()
}
