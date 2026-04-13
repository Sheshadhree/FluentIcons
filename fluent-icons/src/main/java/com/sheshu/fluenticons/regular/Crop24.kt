package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Crop24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Crop24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.25f, 17f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            curveToRelative(0f, 0.38f, -0.282f, 0.694f, -0.648f, 0.743f)
            lineTo(21.25f, 18.5f)
            horizontalLineTo(18.5f)
            verticalLineToRelative(2.75f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            curveToRelative(-0.38f, 0f, -0.694f, -0.282f, -0.743f, -0.648f)
            lineTo(17f, 21.25f)
            verticalLineTo(18.5f)
            horizontalLineTo(8.75f)
            curveToRelative(-1.733f, 0f, -3.15f, -1.357f, -3.245f, -3.066f)
            lineTo(5.5f, 15.25f)
            lineTo(5.499f, 7f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 7f, 2f, 6.664f, 2f, 6.25f)
            curveToRelative(0f, -0.38f, 0.282f, -0.694f, 0.648f, -0.743f)
            lineTo(2.75f, 5.5f)
            horizontalLineToRelative(2.749f)
            lineTo(5.5f, 2.75f)
            curveTo(5.5f, 2.336f, 5.836f, 2f, 6.25f, 2f)
            curveToRelative(0.38f, 0f, 0.694f, 0.282f, 0.743f, 0.648f)
            lineTo(7f, 2.75f)
            lineTo(6.999f, 5.5f)
            horizontalLineTo(7f)
            verticalLineTo(7f)
            horizontalLineTo(6.999f)
            lineTo(7f, 15.25f)
            curveToRelative(0f, 0.918f, 0.707f, 1.671f, 1.607f, 1.744f)
            lineTo(8.75f, 17f)
            horizontalLineToRelative(12.5f)
            close()
            moveTo(8f, 5.5f)
            horizontalLineToRelative(7.25f)
            curveToRelative(1.733f, 0f, 3.15f, 1.356f, 3.245f, 3.066f)
            lineTo(18.5f, 8.75f)
            verticalLineTo(16f)
            horizontalLineTo(17f)
            verticalLineTo(8.75f)
            curveToRelative(0f, -0.918f, -0.707f, -1.671f, -1.607f, -1.744f)
            lineTo(15.25f, 7f)
            horizontalLineTo(8f)
            verticalLineTo(5.5f)
            close()
        }
    }.build()
}
