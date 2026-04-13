package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Couch12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Couch12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 2f)
            horizontalLineToRelative(-5f)
            curveTo(2.672f, 2f, 2f, 2.672f, 2f, 3.5f)
            verticalLineToRelative(0.514f)
            curveTo(2.082f, 4.004f, 2.166f, 4f, 2.25f, 4f)
            curveToRelative(1.158f, 0f, 2.112f, 0.875f, 2.236f, 2f)
            horizontalLineToRelative(3.028f)
            curveTo(7.638f, 4.875f, 8.592f, 4f, 9.75f, 4f)
            curveTo(9.835f, 4f, 9.918f, 4.005f, 10f, 4.014f)
            verticalLineTo(3.5f)
            curveTo(10f, 2.672f, 9.328f, 2f, 8.5f, 2f)
            close()
            moveToRelative(1.25f, 3f)
            curveTo(9.836f, 5f, 9.92f, 5.009f, 10f, 5.025f)
            curveToRelative(0.57f, 0.116f, 1f, 0.62f, 1f, 1.225f)
            verticalLineTo(8.5f)
            curveToRelative(0f, 0.653f, -0.417f, 1.209f, -1f, 1.415f)
            verticalLineTo(10.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(9f, 10.776f, 9f, 10.5f)
            verticalLineTo(10f)
            horizontalLineTo(3f)
            verticalLineToRelative(0.5f)
            curveTo(3f, 10.776f, 2.776f, 11f, 2.5f, 11f)
            reflectiveCurveTo(2f, 10.776f, 2f, 10.5f)
            verticalLineTo(9.915f)
            curveTo(1.417f, 9.709f, 1f, 9.153f, 1f, 8.5f)
            verticalLineTo(6.25f)
            curveToRelative(0f, -0.605f, 0.43f, -1.11f, 1f, -1.225f)
            curveTo(2.08f, 5.009f, 2.164f, 5f, 2.25f, 5f)
            curveTo(2.94f, 5f, 3.5f, 5.56f, 3.5f, 6.25f)
            curveTo(3.5f, 6.664f, 3.836f, 7f, 4.25f, 7f)
            horizontalLineToRelative(3.5f)
            curveTo(8.164f, 7f, 8.5f, 6.664f, 8.5f, 6.25f)
            curveTo(8.5f, 5.56f, 9.06f, 5f, 9.75f, 5f)
            close()
        }
    }.build()
}
