package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TriangleDown48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TriangleDown48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.241f, 39.566f)
            curveToRelative(0.652f, 1.238f, 2.422f, 1.248f, 3.088f, 0.017f)
            lineToRelative(15.954f, -29.502f)
            curveToRelative(0.63f, -1.165f, -0.214f, -2.582f, -1.54f, -2.582f)
            horizontalLineTo(8.256f)
            curveToRelative(-1.317f, 0f, -2.162f, 1.4f, -1.549f, 2.565f)
            lineToRelative(15.534f, 29.502f)
            close()
            moveToRelative(5.287f, 1.206f)
            curveToRelative(-1.617f, 2.99f, -5.915f, 2.966f, -7.499f, -0.041f)
            lineTo(4.495f, 11.229f)
            curveTo(3.005f, 8.4f, 5.057f, 5f, 8.255f, 5f)
            horizontalLineToRelative(31.488f)
            curveToRelative(3.22f, 0f, 5.27f, 3.44f, 3.739f, 6.272f)
            lineToRelative(-15.954f, 29.5f)
            close()
        }
    }.build()
}
