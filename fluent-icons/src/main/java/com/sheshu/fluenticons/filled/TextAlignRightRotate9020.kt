package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextAlignRightRotate9020: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextAlignRightRotate9020",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.75f, 6f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(15f, 17.664f, 15f, 17.25f)
            verticalLineTo(6.75f)
            curveTo(15f, 6.336f, 15.336f, 6f, 15.75f, 6f)
            close()
            moveToRelative(-5f, -4f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(10f, 17.664f, 10f, 17.25f)
            verticalLineTo(2.75f)
            curveTo(10f, 2.336f, 10.336f, 2f, 10.75f, 2f)
            close()
            moveTo(6.5f, 9.75f)
            curveTo(6.5f, 9.336f, 6.164f, 9f, 5.75f, 9f)
            reflectiveCurveTo(5f, 9.336f, 5f, 9.75f)
            verticalLineToRelative(7.5f)
            curveTo(5f, 17.664f, 5.336f, 18f, 5.75f, 18f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-7.5f)
            close()
        }
    }.build()
}
