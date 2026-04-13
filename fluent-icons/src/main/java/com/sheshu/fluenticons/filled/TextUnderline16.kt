package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TextUnderline16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextUnderline16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 13.75f)
            curveTo(4f, 13.336f, 4.336f, 13f, 4.75f, 13f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-6.5f)
            curveTo(4.336f, 14.5f, 4f, 14.164f, 4f, 13.75f)
            close()
            moveTo(4.75f, 2f)
            curveTo(5.164f, 2f, 5.5f, 2.336f, 5.5f, 2.75f)
            verticalLineTo(8f)
            curveToRelative(0f, 0.663f, 0.263f, 1.299f, 0.732f, 1.768f)
            curveTo(6.702f, 10.237f, 7.337f, 10.5f, 8f, 10.5f)
            reflectiveCurveToRelative(1.299f, -0.263f, 1.768f, -0.732f)
            curveTo(10.237f, 9.298f, 10.5f, 8.663f, 10.5f, 8f)
            verticalLineTo(2.75f)
            curveTo(10.5f, 2.336f, 10.836f, 2f, 11.25f, 2f)
            reflectiveCurveTo(12f, 2.336f, 12f, 2.75f)
            verticalLineTo(8f)
            curveToRelative(0f, 1.06f, -0.421f, 2.078f, -1.172f, 2.828f)
            curveTo(10.078f, 11.578f, 9.061f, 12f, 8f, 12f)
            curveToRelative(-1.06f, 0f, -2.078f, -0.421f, -2.828f, -1.172f)
            curveTo(4.422f, 10.078f, 4f, 9.061f, 4f, 8f)
            verticalLineTo(2.75f)
            curveTo(4f, 2.336f, 4.336f, 2f, 4.75f, 2f)
            close()
        }
    }.build()
}
