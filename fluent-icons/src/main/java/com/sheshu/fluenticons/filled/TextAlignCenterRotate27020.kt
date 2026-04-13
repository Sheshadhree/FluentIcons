package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextAlignCenterRotate27020: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextAlignCenterRotate27020",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.25f, 16f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(4.75f)
            curveTo(3.5f, 4.336f, 3.836f, 4f, 4.25f, 4f)
            reflectiveCurveTo(5f, 4.336f, 5f, 4.75f)
            verticalLineToRelative(10.5f)
            curveTo(5f, 15.664f, 4.664f, 16f, 4.25f, 16f)
            close()
            moveToRelative(5f, 2f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(2.75f)
            curveTo(8.5f, 2.336f, 8.836f, 2f, 9.25f, 2f)
            reflectiveCurveTo(10f, 2.336f, 10f, 2.75f)
            verticalLineToRelative(14.5f)
            curveTo(10f, 17.664f, 9.664f, 18f, 9.25f, 18f)
            close()
            moveToRelative(4.25f, -4.75f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(15f, 13.664f, 15f, 13.25f)
            verticalLineToRelative(-6.5f)
            curveTo(15f, 6.336f, 14.664f, 6f, 14.25f, 6f)
            reflectiveCurveTo(13.5f, 6.336f, 13.5f, 6.75f)
            verticalLineToRelative(6.5f)
            close()
        }
    }.build()
}
